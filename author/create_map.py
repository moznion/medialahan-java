# -*- coding: utf-8 -*-

import os
import yaml

if __name__ == '__main__':
    self_path = os.path.abspath(os.path.dirname(__file__))
    yaml_file_path = '%s/../medialahan/mime_types.yaml' % self_path

    f = open(yaml_file_path, 'r')
    data = yaml.load(f)
    f.close()

    print('package net.moznion.medialahan;')
    print('')
    print('import java.util.HashMap;')
    print('import java.util.Map;')
    print('')
    print('class TypeMap {')
    print('    static final Map<String, String> CONTENT_TYPE_TO_EXT = new HashMap<String, String>() {')
    print('        {')

    for content_type, exts in data.items():
        print('            put("%s", "%s");' % (content_type, exts[0]))

    print('        }')
    print('    };')
    print('')
    print('    static final Map<String, String> EXT_TO_CONTENT_TYPE = new HashMap<String, String>() {')
    print('        {')

    bag = {}
    for content_type, exts in data.items():
        for ext in exts:
            if bag.get(ext) == None:
                print('            put("%s", "%s");' % (ext, content_type))
                bag[ext] = True

    print('        }')
    print('    };')
    print('}')
